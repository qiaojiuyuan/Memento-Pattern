# Memento-Pattern
## 备忘录模式
### 项目类图
![项目类图](https://github.com/qiaojiuyuan/Memento-Pattern/raw/master/project_class.png)
### 通用类图
![通用类图](https://github.com/qiaojiuyuan/Memento-Pattern/raw/master/common_class.png)
### 定义
```
在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后
就可将该对象恢复到原先保存的状态。
```
### 使用场景
* 需要保存和恢复数据的相关状态场景
* 提供一个可回滚的操作
* 需要监控的副本场景中。
### 注意事项
* 备忘录的生命周期
```
备忘录创建出来就要在"最近"的代码中使用，要主动管理它的生命周期，建立就要使用，不使用就要立刻删除其引用。
```
* 备忘录的性能
```
不要在频繁建立备份的场景中使用备忘录模式，比如一个for循环中
```
