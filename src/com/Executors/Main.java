package com.Executors;

public class Main {

	public static void main(String[] args) {
		Server server = new Server();
		for(int i = 0;i<100;i++){
			Task task = new Task("task"+i);
			server.ExecutorTask(task);
		}
	}

}
