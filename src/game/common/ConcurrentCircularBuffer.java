package game.common;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentCircularBuffer<T> {
	Semaphore spaceLeft;
	Semaphore objectsLeft;
	Lock mutex;
	Object[] data;
	int currentHead;
	int currentTail;
	
	/**
	 * Constructor for concurrent Buffer.
	 * @param size The size of the Buffer.
	 */
	ConcurrentCircularBuffer(int size){
		mutex=new ReentrantLock();
		spaceLeft=new Semaphore(size);
		objectsLeft=new Semaphore(0);
		data=new Object[size];
		currentHead=0;
		currentTail=0;
		
	}
	/**
	 * Function used to get items from the Buffer in FIFO fashion.
	 * Note that this is a blocking call, for the love of all that
	 *  is good and holy DO NOT call this from the main thread.
	 * @return The element at the front of the buffer.
	 * @throws InterruptedException This function locks a thread if the semaphore or lock are unavailable.
	 */
	public T pop() throws InterruptedException{
		objectsLeft.acquire();
		mutex.lock();
		@SuppressWarnings("unchecked")
		T ret=(T)data[currentHead++];
		mutex.unlock();
		spaceLeft.release();
		return ret;
	}
	/**
	 * Function used to put items into the Buffer.
	 * Note that this is a blocking call, for the love of all that
	 *  is good and holy DO NOT call this from the main thread.
	 * @param arg The element to be put into the buffer.
	 * @throws InterruptedException This function locks a thread if the semaphore or lock are unavailable.
	 */
	public void push(T arg) throws InterruptedException{
		spaceLeft.acquire();
		mutex.lock();
		data[currentTail++]=arg;
		mutex.unlock();
		objectsLeft.release();
	}

}
