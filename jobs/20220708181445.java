package com.atguigu.authorize.demo01;

import com.atguigu.authorize.demo00.SubClass;

/**
 * @ClassName AuthorizeDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月07日 11时46分14秒
 * @Version 1.0
 *
 * 权限访问级别:
 *      含义:
 *          权限访问级别其实就是封装思想的核心体现
 *      分类(从小到大):
 *          private < 缺省 < protected < public
 *      修饰范围:
 *          private权限访问级别:
 *              修饰范围:被private修饰的内容只能在本类中进行访问和使用,在本类之外无法进行访问和使用,否则编译报错
 *          "缺省"权限访问级别:
 *              修饰范围:
 *                  1.兼容private权限访问级别的修饰范围
 *                  2.权限访问级别是"缺省"的内容,只能在本包中进行访问和使用,在本包之外无法进行访问和使用,否则编译报错
 *          protected权限访问级别:
 *              修饰范围:
 *                  1.兼容"缺省"权限访问级别的修饰范围
 *                  2.被protected修饰的内容只能在同一个项目中且具有子父类继承关系中使用,如果跨包访问且没有继承关系编译报错
 *                  (如果涉及同一个项目但不同模块,需要修改项目的配置文件workspace.xml,暂不涉及)
 *          public权限访问级别:
 *              修饰范围:
 *                  1.兼容"protected"权限访问级别的修饰范围
 *                  2.被public修饰的内容只能在同一个项目中进行访问和使用,超出项目之外无法进行访问和使用,否则编译报错
 *                  (如果涉及同一个项目但不同模块,需要修改项目的配置文件workspace.xml,暂不涉及)
 *
 * 思考题:如需进行跨项目的数据访问,怎么办?
 *      序列化和反序列化(在JavaSE部分在IO流部分讲解序列化和反序列化的第一种形式:对象流)
 */
class AuthorizeDemo01 {
    public static void main(String[] args) {
        //创建SubClass对象
        SubClass sc = new SubClass();
        System.out.println(sc.num);
    }
}
