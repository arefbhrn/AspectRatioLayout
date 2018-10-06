[![](https://jitpack.io/v/arefbhrn/AspectRatioLayout.svg)](https://jitpack.io/#arefbhrn/AspectRatioLayout)

Aspect Ratio Layout
==============================

A library to achieve a view group with aspect ratio attribute

Installation
===============================

Gradle

```
dependencies {
    implementation 'com.github.arefbhrn:aspectratiolayout:1.0.1'
}
```

Usage
===========================

Define 'app' namespace on root view in your layout

```xml
xmlns:app="http://schemas.android.com/apk/res-auto"
```

Include this library in your layout
```
<com.arefbhrn.aspectratiolayout.AspectRatioLayout
    android:id="@+id/container_ratio_layout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:aspectRatio="0.5">
    
    // any other layouts
    
</com.arefbhrn.aspectratiolayout.AspectRatioLayout>
 ```
 
####  Supported Attributs

| XML Attribut        | Programmatical Setter           | Description  |
| ------------- |:-------------:| ---------:|
| app:aspectRatio      | setAspectRatio(float ratio)     | aspect ratio (height / width). |
 
Contact me
===========================

If you have a better idea or way on this project, please let me know, thanks :)

[Email](mailto:arefprivate@gmail.com)

License
===========================

This project is licensed under the Apache 2.0 License - see the [LICENSE.md](LICENSE.md) file for details
