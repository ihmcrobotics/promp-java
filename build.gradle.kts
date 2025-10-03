plugins {
   id("us.ihmc.ihmc-build")
}

ihmc {
   group = "us.ihmc"
   version = "1.0.2"
   vcsUrl = "https://github.com/ihmcrobotics/promp-java"
   openSource = true

   configureDependencyResolution()
   configurePublications()
}

mainDependencies {
   api("org.bytedeco:javacpp:1.5.11")
   api("us.ihmc:ihmc-native-library-loader:2.0.6")
   api("us.ihmc:log-tools:0.6.3")
}
