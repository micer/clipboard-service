# clipboard-service
A simple Android service that accepts the string and saves it to clipboard.

I'm using this service to save string from computer to clipboard in Android device.

## Usage:

Run these commands from computer's command-line terminal. Device needs to be connected via [ADB](https://developer.android.com/studio/command-line/adb).

#### Start service and pass a string value to be saved in device's clipboard:
```
adb shell am startservice -a eu.micer.ClipboardService -e text "SampleText"
```

#### Invoke paste action:
```
adb shell input keyevent 279
```


#### Not working?

It can happen that you get this error:
```
 ~ adb shell am startservice -a eu.micer.ClipboardService -e text "SampleText"
Starting service: Intent { act=eu.micer.ClipboardService (has extras) }
Error: app is in background uid null
```

You just need to start the app via command:
```
adb shell am start -n eu.micer.clipboardservice/eu.micer.clipboardservice.EmptyActivity
```
or find the **ClipboardService** in the app list and start it manually.
