# scala-gradle.g8

A [giter8][1] project template for projects using [Scala][2] and [Gradle][3].

It allows to quickly setup a new Scala project that works out of the box.

## How to use

### Install giter8

You must install the [giter8][1] CLI command `g8` locally.  You can do this using the official [setup instructions][4] or using Coursier (see below).

#### Install g8 using Coursier

You can also use [Coursier][5] to install giter8.

First install the [coursier][6] CLI tool.  Then create the `g8` executable with:

```
coursier install giter8
```

Make sure your Coursier bin directory is on your `PATH`:

```
export PATH="$PATH:$HOME/.local/share/coursier/bin"
```

Or, if that doesn't work:

```
coursier bootstrap org.foundweekends.giter8:giter8-launcher_2.12:0.12.0 \
  --main giter8.LauncherMain -o g8 -f
```

Put the `g8` executable anywhere in your `$PATH` directories, or access it using `./g8`.

### Create a project

To create a project, use `g8` (see above):

```
g8 cstroe/scala-gradle.g8 -o my-new-project
```

Where `my-new-project` is your project's directory name.

[1]: http://www.foundweekends.org/giter8/
[2]: https://scala-lang.org/
[3]: https://gradle.org/
[4]: http://www.foundweekends.org/giter8/setup.html
[5]: https://get-coursier.io/
[6]: https://get-coursier.io/docs/cli-installation.html#linux-macos
