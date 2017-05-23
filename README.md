# nbpayara-demo
Demonstrates how to use Java EE technologies on top of a NetBeans Platform application. 

How to use: 

1. Download / pull this project and also nbpayara, nbpayara-spi, nbpayara-web-demo, and nbpayara-demo-beans from https://github.com/borisheithecker

2. Resolve references, build everything. You also need a local GlassFish or Payara installation, possibly registered with the NetBeans IDE.

3. For this demo to work, GlassFish must run in LOCAL jms mode: Start GlassFish, open the console at localhost:4848, navigate to Configuration -> server-config -> Java Message Service, set JMS Service Type: LOCAL. Restart GlassFish. 

4. 
