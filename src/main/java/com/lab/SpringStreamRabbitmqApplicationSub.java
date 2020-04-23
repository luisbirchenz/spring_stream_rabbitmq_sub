package com.lab;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.annotation.StreamListener;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SpringStreamRabbitmqApplicationSub {

	public static void main(String[] args) {
		SpringApplication.run(SpringStreamRabbitmqApplicationSub.class, args);
	}
	
	@StreamListener(Sink.INPUT)
	public void handleMessage(Message message){
		System.out.println("Received Message is: " + message);
	}

	public static class Message{
		private String message;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		@Override
		public String toString() {
			return "Message{" +
					"message='" + message + '\'' +
					'}';
		}
	}

}
