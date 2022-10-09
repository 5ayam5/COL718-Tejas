g++ -o hello.o -static hello_world.cpp

java -jar /home/akshin/Desktop/test/Tejas/jars/tejas.jar /home/akshin/Desktop/test/Tejas/src/simulator/config/config.xml /home/akshin/Desktop/test/Tejas/tests/hello.out /home/akshin/Desktop/test/Tejas/tests/hello.o

kill -9 $(ps -aux | grep "hello.o" | grep -v "grep" | awk '{print $2}')

