# FrameAnimationView
一个帧动画实现，用来替换官方的AnimationDrawable，解决内存溢出!

# Gradle
[![Download](https://api.bintray.com/packages/li-xiaojun/jrepo/frameanimview/images/download.svg)](https://bintray.com/li-xiaojun/jrepo/frameanimview/_latestVersion)

```
compile 'com.lxj.frameanimview:frameanimview:1.0.0'
```

# Usage
```kotlin
// settings
iv.apply {
    setInterval(10)
    setIsLoop(false)
    setFramesArray(frames)
}
iv.start()
iv.stop()
```