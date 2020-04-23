# Subscriber - Communication from Spring app with Spring Cloud Stream and RabbitMQ

I included Spring cloud Stream in order to integrate it with the broker with minimum settings. I use in this example RabbitMQ
so I'd suggest to get it from docker [here](https://hub.docker.com/_/rabbitmq/). Remember the user/pass by default is guest/guest
you can run it on http://localhost:15672 by default as well.

Once you have that up and running, you can test this by starting up this application and then go to RabbitMQ console, a queue 
under the input exchange is created, and there we can publish messages by following this format:
{"message":"whatever you want to write here"}

After publishing it, you should be able to see this message in the IDE console where this application is running.

In the other project I'm going to do the publisher.





