# HTTP server 101

At the very least, an HTTP server is just a plain old computer. Because it is a server, it needs to be connected to a network from where it gets its request from. 

The HTTP server needs to be listening for a request on that network, at least in one port. Typically unencrypted traffic usually happens on port 80, while encrypted traffic will happen on port 443. This is the simplest scenerio. Maybe later we will make it listen to any other port. 

So a person surfing the web comes along with his web browser, types the address for your server and hits the enter key. The browser creates a connection through that network to the server. After the connection is established the browser creates the request message to send to the server and shoots that message through the connection. The server receives that message and tries to make sense of what the browser wants, usually some file located on the file system. This file on the filesystem is most often referred to as the web root. 

The web root is a specific folder where the server has access and permissions to retrieve files from and send over to the clients. The server searches for the final that satisfies the request, composes a response based on that file, and shoots a response to the client through the connection that was already established. After the sending of the response is complete, the browser will do whatever it needs to do and the server will close that connection. If further connections are needed from the browser for other files, the browser reopens the connections and makes further requests. 

So what we need for this project to work is:
- **read configuration files:** how are we gonna write those configurations files, what's the semantics, things like that
- **open a socket to listen at a port:** how many connections is the server gonna handle, managing those connections (multi-threaded)
- **read request messages:** http protocol part, read them, parse them, understand what is going on/what is the client requesting
- **open and read files from the Filesystem:** grab the file the client is talking about, read it
- **write response messages:** compose, make it make sense and make it compliant with http protocol