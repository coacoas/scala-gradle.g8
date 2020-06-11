# $name$

$project_description$

## Requirements

* JDK 8+: can be obtained from [AdoptOpenJDK](https://adoptopenjdk.net/) and other sources.

## Usage

Build this project with:

```
./gradlew build
```

## Testing

Unit tests are automatically run as part of the `build` task.  You can access test reports in the `build/reports/test` directory:

```
xdg-open build/reports/test/index.html
```

NOTE: On MacOS, use `open` instead of `xdg-open`.
