# nbpayara-demo
Demonstrates how to use Java EE technologies on top of a NetBeans Platform application. 

How to use: 

1. Download / pull this project and also nbpayara, nbpayara-spi, nbpayara-web-demo, and nbpayara-demo-beans from https://github.com/borisheithecker

2. Resolve references, build everything. You also need a local GlassFish or Payara installation, possibly registered with the NetBeans IDE.

3. For this demo to work, GlassFish must run in LOCAL jms mode: Start GlassFish, open the console at localhost:4848, navigate to Configuration -> server-config -> Java Message Service, set JMS Service Type: LOCAL. Restart GlassFish. 

4. Run nbpayara-web-demo from the IDE. A browser window should open at http://localhost:8080/nbpayara-web-demo/. Try the chat demo, reload the page if it doesn't work immediately. After choosing a user name, you should see a window displaying all messages sent. 

5. Now debug or run nbpayara-demo-app. A skeleton NetBeans Platform application should open up. From the domain combo box in the main toolbar, select the only available entry. Open Menu -> Window -> NbLive TopComponent. You should see an editor component displaying all messages from the server. This may take a few seconds. 

6. You can post messages from within the platform application and from the web interface. The displaying windows at both places should always be updated immediately. 

The demo web application is an adapted version of the PrimeFaces chat demo (https://www.primefaces.org/showcase/push/chat.xhtml). 

The actual demo client in the NetBeans platform consists of only one class: NbLiveTopComponent.java.
