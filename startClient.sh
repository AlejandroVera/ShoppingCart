#! /bin/bash
if [ -z $AXIS2_HOME ]; then
	echo "No se ha definido AXIS2_HOME";
	exit 1;
fi

CLASSPATH="$AXIS2_HOME/lib/*:$AXIS2_HOME/repository/modules/addressing-1.5.4.mar:./client/lib/*:./client/bin"
echo $CLASSPATH
if [ "$1" = 'test' ]; then
	java -classpath $CLASSPATH client.AutomaticTests
else
	java -classpath $CLASSPATH client.ClientLauncher
fi
