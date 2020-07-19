# Running a Server

## Installation
1. Select the folder where you want to store your server files.
```bash
cd /path/to/folder
```

2. Download [Spigot](https://hub.spigotmc.org/stash/projects/SPIGOT), a fork of the Minecraft server.
```bash
curl https://cdn.getbukkit.org/spigot/spigot-1.8.8-R0.1-SNAPSHOT-latest.jar -Lo spigot.jar
```

3. Create a plugins folder and download the latest version of AutoReferee.
```bash
mkdir plugins
curl https://github.com/AutoReferee/AutoReferee/releases/latest/download/AutoReferee.jar -Lo plugins/AutoReferee.jar
```

4. Run the server
```bash
java -jar spigot.jar nogui
```
