package cit360.threads;

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
		Threads first = new Threads("thread1");
        Threads second = new Threads("thread2");

		try {
			while(first.testThread.isAlive()) {
				System.out.println("The Thread is Alive");
				Thread.sleep(500);
            }
        }
		catch(InterruptedException e) {
			System.out.println(first + "was Interrupted");
		}
	}
}


