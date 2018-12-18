Compile the idl file using the idlj command as below:

idlj  -fall  Addition.idl

Open a new windows of CMD console, type in the following command to start the ORB

start orbd -ORBInitialPort 1050

Click on Arguments and type in the following arguments inside the Program arguments. Click Apply once done:
-ORBInitialPort 1050 -ORBInitialHost localhost

Click on Arguments, then under the Program arguments, type in the following :
-ORBInitialPort 1050 -ORBInitialHost localhost