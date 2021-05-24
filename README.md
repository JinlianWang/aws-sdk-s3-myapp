# aws-sdk-s3-myapp

```

https://www.baeldung.com/aws-s3-java
https://www.baeldung.com/java-create-jar
https://javatutorial.net/java-s3-example

https://aws.amazon.com/sdk-for-java/
https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/home.html
https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/examples-s3.html
https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/home.html
https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/
https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/home.html
https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/get-started.html
https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/setup-project-maven.html
https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/setup-project-gradle.html
https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/setup-project-graalvm.html
https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/setup-additional.html

https://aws.amazon.com/tools/
https://aws.amazon.com/eclipse/
https://docs.aws.amazon.com/toolkit-for-eclipse/v1/user-guide/welcome.html
https://aws.amazon.com/intellij/
https://docs.aws.amazon.com/toolkit-for-jetbrains/latest/userguide/welcome.html

https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/get-started.html

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk/1.11.1024
https://maven.apache.org/plugins/maven-dependency-plugin/list-mojo.html
http://maven.apache.org/plugins/maven-assembly-plugin/usage.html
https://www.baeldung.com/java-create-jar
https://www.baeldung.com/aws-s3-java

https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingBucket.html
latest/userguide/storage-inventory.html
https://s3.console.aws.amazon.com/s3/home?region=us-west-2
https://console.aws.amazon.com/iam/home?region=us-east-1#/users/TestSDK?section=security_credentials
https://aws.amazon.com/iam/faqs/
https://s3.console.aws.amazon.com/s3/home?region=us-east-1#
https://docs.aws.amazon.com/toolkit-for-eclipse/v1/user-guide/welcome.html
https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/get-started.html
https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/setup-install.html

https://console.aws.amazon.com/iam/home?region=us-east-1#/users$new?step=final&accessKey&userNames=TestSDK&permissionType=policies&policies=arn:aws:iam::aws:policy%2FAmazonS3FullAccess

https://signin.aws.amazon.com/signin?redirect_uri=https%3A%2F%2Fconsole.aws.amazon.com%2Fiam%2F%3Fstate%3DhashArgs%2523%26isauthcode%3Dtrue&client_id=arn%3Aaws%3Aiam%3A%3A015428540659%3Auser%2Fiam&forceMobileApp=0&code_challenge=xydGrZgAaE-DEljL1KWaJOSfesnZMfTL3LwkalUcmXE&code_challenge_method=SHA-256

https://signin.aws.amazon.com/signin?redirect_uri=https%3A%2F%2Fconsole.aws.amazon.com%2Fiam%2F%3Fstate%3DhashArgs%2523%26isauthcode%3Dtrue&client_id=arn%3Aaws%3Aiam%3A%3A015428540659%3Auser%2Fiam&forceMobileApp=0&code_challenge=xydGrZgAaE-DEljL1KWaJOSfesnZMfTL3LwkalUcmXE&code_challenge_method=SHA-256

https://aws.amazon.com/developer/language/java/?whats-new-content-developer-tools.sort-by=item.additionalFields.postDateTime&whats-new-content-developer-tools.sort-order=desc&developer-tools-blog-posts.sort-by=item.additionalFields.createdDate&developer-tools-blog-posts.sort-order=desc

https://signin.aws.amazon.com/signin?redirect_uri=https%3A%2F%2Fconsole.aws.amazon.com%2Fiam%2F%3Fstate%3DhashArgs%2523%26isauthcode%3Dtrue&client_id=arn%3Aaws%3Aiam%3A%3A015428540659%3Auser%2Fiam&forceMobileApp=0&code_challenge=xydGrZgAaE-DEljL1KWaJOSfesnZMfTL3LwkalUcmXE&code_challenge_method=SHA-256

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

mvn -B archetype:generate \
  -DarchetypeGroupId=org.apache.maven.archetypes \
  -DgroupId=com.example.myapp \
  -DartifactId=myapp

mvn -B archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.example.myapp -DartifactId=myapp

mvn package

mvn exec:java -Dexec.mainClass="com.example.myapp.App"

C:\Users\David Holberton\myapp>mvn exec:java -Dexec.mainClass="com.example.myapp.App"
[INFO] Scanning for projects...
[INFO]
[INFO] ----------------------< com.example.myapp:myapp >-----------------------
[INFO] Building myapp 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- exec-maven-plugin:3.0.0:java (default-cli) @ myapp ---
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Creating bucket: bucket1621814826845
bucket1621814826845 is ready.

Uploading object...
Upload complete

Cleaning up...
Deleting object: key
key has been deleted.
Deleting bucket: bucket1621814826845
bucket1621814826845 has been deleted.

Cleanup complete

Closing the connection to Amazon S3
Connection closed
Exiting...
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.011 s
[INFO] Finished at: 2021-05-23T20:07:09-04:00
[INFO] ------------------------------------------------------------------------

C:\Users\David Holberton\myapp>

C:\Users\David Holberton\myapp>mvn exec:java -Dexec.mainClass="com.example.myapp.App"
[INFO] Scanning for projects...
[INFO]
[INFO] ----------------------< com.example.myapp:myapp >-----------------------
[INFO] Building myapp 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- exec-maven-plugin:3.0.0:java (default-cli) @ myapp ---
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Creating bucket: bucket1621815669151
bucket1621815669151 is ready.

Uploading object...
Upload complete

Cleaning up...
Deleting object: key
key has been deleted.
Deleting bucket: bucket1621815669151
bucket1621815669151 has been deleted.

Cleanup complete

Closing the connection to Amazon S3
Connection closed
Exiting...
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.762 s
[INFO] Finished at: 2021-05-23T20:21:11-04:00
[INFO] ------------------------------------------------------------------------

C:\Users\David Holberton\myapp>

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk
https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk/1.11.1024

<!-- https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk -->
<dependency>
    <groupId>com.amazonaws</groupId>
    <artifactId>aws-java-sdk</artifactId>
    <version>1.11.1024</version>
</dependency>

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-assembly-plugin
https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-assembly-plugin/3.3.0

<!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-assembly-plugin -->
<dependency>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-assembly-plugin</artifactId>
    <version>3.3.0</version>
</dependency>

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

mvn dependency:list
mvn clean compile assembly:single
java -cp target\edmsxfer4-1.0-SNAPSHOT-jar-with-dependencies.jar org.example.App
java -jar target\edmsxfer4-1.0-SNAPSHOT-jar-with-dependencies.jar


http://maven.apache.org/plugins/maven-assembly-plugin/
http://maven.apache.org/plugins/maven-assembly-plugin/usage.html

    <project>
      [...]
      <build>
        [...]
        <plugins>
          <plugin>
            <!-- NOTE: We don't need a groupId specification because the group is
                 org.apache.maven.plugins ...which is assumed by default.
             -->
            <artifactId>maven-assembly-plugin</artifactId>
            <version>3.3.0</version>
            <configuration>
              <descriptorRefs>
                <descriptorRef>jar-with-dependencies</descriptorRef>
              </descriptorRefs>
            </configuration>
            [...]
    </project>

    <project>
      [...]
      <build>
        [...]
        <plugins>
          <plugin>
            <artifactId>maven-assembly-plugin</artifactId>
            <version>3.3.0</version>
            <configuration>
              <descriptors>
                <descriptor>src/assembly/src.xml</descriptor>
              </descriptors>
            </configuration>
            [...]
    </project>

    <project>
      [...]
      <build>
        [...]
        <plugins>
          <plugin>
            <artifactId>maven-assembly-plugin</artifactId>
            <version>3.3.0</version>
            <configuration>
              <descriptorRefs>
                <descriptorRef>jar-with-dependencies</descriptorRef>
              </descriptorRefs>
            </configuration>
            <executions>
              <execution>
                <id>make-assembly</id> <!-- this is used for inheritance merges -->
                <phase>package</phase> <!-- bind to the packaging phase -->
                <goals>
                  <goal>single</goal>
                </goals>
              </execution>
            </executions>
          </plugin>
          [...]
    </project>

    <project>
      [...]
      <build>
        [...]
        <plugins>
          <plugin>
            <artifactId>maven-assembly-plugin</artifactId>
            <version>3.3.0</version>
            <configuration>
              [...]
              <archive>
                <manifest>
                  <mainClass>org.sample.App</mainClass>
                </manifest>
              </archive>
            </configuration>
            [...]
          </plugin>
          [...]
    </project>

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

C:\Users\David Holberton>idea.bat
Dynamic Code Evolution 64-Bit Server VM warning: Option UseConcMarkSweepGC was deprecated in version 9.0 and will likely be removed in a future release.
2021-05-22 08:50:46,673 [  57073]   WARN -      #org.jetbrains.idea.maven - Cannot overwrite: C:\Users\David Holberton\AppData\Local\JetBrains\IntelliJIdea2021.1\Maven\Indices\Index0\data1\context\_o3.cfs
org.jetbrains.idea.maven.server.MavenServerIndexerException: Cannot overwrite: C:\Users\David Holberton\AppData\Local\JetBrains\IntelliJIdea2021.1\Maven\Indices\Index0\data1\context\_o3.cfs
        at org.jetbrains.idea.maven.server.Maven3ServerIndexerImpl.addArtifact(Maven3ServerIndexerImpl.java:273)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:566)

```
        

