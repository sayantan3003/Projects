#!/bin/bash

# Navigate to the project directory
cd /home/sayantan/Projects/labcare

# Run Maven to build the WAR file
mvn clean package

# Check if the WAR file was created
if [ -f target/labcare.war ]; then
  # Copy the WAR file to Tomcat's webapps directory
  sudo cp target/labcare.war /opt/tomcat/webapps/

  # Optional: Restart Tomcat
  sudo /opt/tomcat/bin/shutdown.sh
  sudo /opt/tomcat/bin/startup.sh
else
  echo "WAR file not found in target directory."
fi

