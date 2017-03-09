/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.threads;

/**
 *
 * @author Philip
 */
public class Threads implements Runnable {

	Thread testThread;

	Threads(String tname) {

		testThread = new Thread(this, tname);
		System.out.println("Thread " + tname + " created");

		testThread.start();
		System.out.println("Thread " + tname + " started");
	}

    @Override
	public void run() {

        int start = 0;
        if (testThread.getName().equals("thread1")) {
            System.out.println("Thread1 counts by 5.");
            for(int t1num = 0; t1num <= 100; t1num += 5) {
                System.out.println(testThread.getName() + " - " + t1num);
            }
        } else {
            System.out.println("Thread2 counts by 10.");
            for(int t2num = 0; t2num <= 100; t2num += 10) {
                System.out.println(testThread.getName() + " - " + t2num);
            }
        }

        System.out.println("The Thread is finished");
	}
}
