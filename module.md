[模块化参考的文章](https://zhuanlan.zhihu.com/p/25420181)


### 问题
调试模块时，
```
 sourceSets {
        main {
            if (isBuildModule.toBoolean()) {
                manifest.srcFile 'src/main/debug/AndroidManifest.xml'
            } else {
                manifest.srcFile 'src/main/release/AndroidManifest.xml'
            }
        }
    }
```
将会导致一个错误：

     Cannot read packageName from....src\main\release\AndroidManifest.xml

导致该错误的原因在于：由于我们未开启调试，选择的release下的配置文件，而在该路径下系统找不到，So...

解决办法：
> 在该模块下，分别创建release & debug 目录，并在该目录下各复制一份AndroidManifest.xml文件。显然，在debug模式下，我们
是要将该模块作为独立App来测试的,所以应该有可以启动的Activity（推荐查看APP的...）

```
- main
    -debug
        - AndroidManifest.xml
    -java
        - ...
    -release
        - AndroidManifest.xml
    -res
        - ....

```
