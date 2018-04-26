# clipboard-service
A simple Android service that accepts the string and saves it to clipboard.

I'm using this service to save string from computer to clipboard in Android device.

## Usage:

#### Start service and pass a string value to be saved in device's clipboard:
```
adb shell am startservice -a eu.micer.ClipboardService -e text "SampleText"
```

#### Invoke paste action:
```
adb shell input keyevent 279
```

[Release APK is available on HockeyApp.](https://rink.hockeyapp.net/apps/c2292af1c719432cae0cbcb668f1e386)
