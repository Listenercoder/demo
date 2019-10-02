#### 变量和数据类型
- 变量
	> + 多种定义方式: var / let / const / function / import / class
	> +  严谨的命名规范：区分大小写 、 驼峰命名、关键字保留
    > + const 创建的变量不能，存储的值不能被修改（可以理解为常量）
    > + ES6的模块导入也可以创建变量
- 数据类型
	> + 基本数据类型（值类型）：数字 number 、字符串 string 、布尔类型 boolean、null、undefinded
	> + 引用数据类型：object（数组、对象、正则…）、function
	> + 唯一值（symbol）
```
//symbol唯一值的用法
let a = symbol(100);
let b = symbol(100);
 alert(a==b); //a==b的结果为false。
```
#### JS中常用的数据类型
- 基本类型
    + 数字Number
    + 字符串 string 
    + 布尔 boolean
    + 空指针 null
    + 未定义类型 undefined
- 引用类型
    + 对象数据类型object
        + {}普通对象
        + []数组对象
        + 正则表达式
        + Math数学函数对象
        + 日期对象
    + function
### number数字类型
> 包含：常规数字、NaN（Not a Number）
> - NaN：不是一个数字，但是隶属于数字类型
> - NaN和任何值包括自己都不相等：NaN !=NaN,所以不能用相等的方式判断是否为有效数字
> - isNaN：检测一个值是否为有效数字，如果不是有效数字返回 true 。
>   + 在使用isNaN进行检测的时候，首先会验证检测的值是否为number，如果不是，先基于Number（）这个方法，把值转换为Number，然后再检测。


```
//console.log([val]) 在控制台输出内容
//NaN和任何值包括自己都不想等
NaN != NaN
//isNaN([val])
console.log(isNaN(10)); //返回值为： false 
console.log(isNaN('10')); //返回值为： false
/*
*   Number("10"); => 10
*   isNaN(10); => false
*
*/
```
