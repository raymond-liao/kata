# kata
Coding kata with Java.


## Helper
### 借助 IDEA Live Templates 快速创建测试方法：
1. 进入 Preference/Editor/Lice Templates
2. 找到 Junit Test，并在 Junit Test 下创建 Live Template（我命名为 test，这样在需要创建测试方法时输入 “test” 按回车即可快速创建测试方法）：
```java
	@Test
	public void should_$NAME$() {
		$END$
	}
```

### IDEA 常用快捷键：
#### 定位和执行
1. 进入项目导航 `command + 1` (文件导航)
2. 选中文件或目录执行 RUN 或 DEBUG `shift + option + F10`
3. 执行上一次 RUN 执行的操作 `shift + F10`: 例如上一次运行的测试操作，或上一次运行项目执行操作 （DEBUG 模式运行 `shift + F9`） 
4. 测试类与实现类之间快速跳转 `command + shift + t`
5. 快速搜索 Class `command + n` 然后键入 Class 的关键字 (输入 GN 可以找到并打开 GameNumber 类)
6. 查找最近编辑的文件 `command + e`
7. 在项目/文件导航快速搜索 `command + F1`
8. 关闭当前打开的文件 `command + F4`
9. 查看最近查看的 tab 或文件 `control + tab`

#### 代码
1. 查看 IDEA 建议的修复代码错误或警告的操作 `option + enter`  => 快速修复（Quick Fix）
2. 选择代码（逐级向上选择） `command + w`
3. 删除代码行 `command + y`
4. 剪切代码行 `command + x`
5. 复制代码行 `command + d`
6. 上下移动光标所在代码行 `option + shift + 方向键`
7. 光标移动到代码块的始末位置 `command + [`，`command + ]`
8. 选择代码块 `command + shift + [`，`command + shift + ]`
9. 将选中的代码或光标之后的代码合并到一行 `control + shift + j`
10. 删除至单词起始或结束位置 `option + del`, `fn + option + del`

##### 重构
1. 提炼函数（Extract Method） `command + option + m`
2. 提炼变量（Extract Variable） `command + option + v`
3. 提炼字段（Extract Field） `command + option + f`
4. 内联（Inline） `command + option + n`
5. 移动函数（Move Method） `F6`
6. 改名（Change Name） `shift + F6`
7. 改变签名（Change Signature） `command + F6`
