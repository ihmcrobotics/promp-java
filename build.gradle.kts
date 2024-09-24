plugins {
   id("us.ihmc.ihmc-build")
   id("us.ihmc.ihmc-ci") version "8.3"
   id("us.ihmc.ihmc-cd") version "1.26"
}

ihmc {
   group = "us.ihmc"
   version = "1.0.0"
   vcsUrl = "https://github.com/ihmcrobotics/promp-java"
   openSource = true

   configureDependencyResolution()
   configurePublications()
}

mainDependencies {
   api("org.bytedeco:javacpp:1.5.9")
   api("us.ihmc:ihmc-native-library-loader:2.0.3")
   api("us.ihmc:log-tools:0.6.3")
}
