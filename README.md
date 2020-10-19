Hurriyet Emlak Test Project

Make sure your docker daemon is running (e.g. docker info works without errors).

Setup

Pull docker-selenium

$ docker pull elgalu/selenium

Pull Zalenium

$ docker pull dosel/zalenium

Starting Zalenium

Linux

docker run --rm -ti --name zalenium -p 4444:4444 \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v /tmp/videos:/home/seluser/videos \
  --privileged dosel/zalenium start 
OSX

docker run --rm -ti --name zalenium -p 4444:4444 \
  -e DOCKER=17.06.2-ce \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v /tmp/videos:/home/seluser/videos \
  --privileged dosel/zalenium start
Windows

Please change "your_user_name" with your user name in Windows

docker run --rm -ti --name zalenium -p 4444:4444 ^
  -v /var/run/docker.sock:/var/run/docker.sock ^
  -v /c/Users/your_user_name/temp/videos:/home/seluser/videos ^
  --privileged dosel/zalenium start   
Run Project With Maven

First, clone project by git. Then run command in below from terminal while in project directory

  mvn clean test
  
  For run project please run testng.xml file
