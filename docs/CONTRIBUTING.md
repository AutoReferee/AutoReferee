# Contributing

## Dependencies
- [Java 8](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html) - the Java Virtual Machine required to run the Minecraft server and PGM plugin.
- [Maven](https://maven.apache.org/install.html) - a compilation tool to bundle all the Java dependencies into `.jar` file

## Steps
1. Clone the repository on your machine.
```bash
git clone git@github.com:AutoReferee/AutoReferee.git
```

2. Make your changes

3. Compile a new version with your changes.
```bash
mvn clean install # creates .jar in target/ which you would copy to your plugins folder
```

4. Commit your changes, using the `-S` and `-s` tag to [sign](https://help.github.com/en/github/authenticating-to-github/signing-commits) and [certify](https://developercertificate.org) the origin of your code.
```bash
git commit -S -s -m "A short description of your changes"
```

5. Submit your pull request for review and feedback.
