package cit360.threads2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Philip
 */
public class ThreadsDemo {

	public static void main(String[] args) {

        Threads thread1 = new Threads("thread1");
        Threads thread2 = new Threads("thread2");

		Executor myExecutor = Executors.newCachedThreadPool();

        try {
			System.out.println("The Thread is Alive");
            while(thread1.testThread.isAlive()) {
                myExecutor.execute(thread1);
				myExecutor.execute(thread2);
			}
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}


