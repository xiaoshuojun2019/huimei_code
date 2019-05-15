//package com.leyou.auth.test;
//
//import com.leyou.auth.entity.UserInfo;
//import com.leyou.auth.utils.JwtUtils;
//import com.leyou.auth.utils.RsaUtils;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.security.PrivateKey;
//import java.security.PublicKey;
//import java.util.Date;
//
///**
// * @Author: 98050
// * @Time: 2018-10-23 20:58
// * @Feature: JWT测试
// */
//public class JwtTest {
//
//    private static final String pubKeyPath = "E:\\tmp\\rsa\\rsa.pub";
//
//    private static final String priKeyPath = "E:\\tmp\\rsa\\rsa.pri";
//
//    private PublicKey publicKey;
//
//    private PrivateKey privateKey;
//
//    @Test
//    public void testRsa() throws Exception {
//        RsaUtils.generateKey(pubKeyPath, priKeyPath, "234");
//    }
//
//    @Before
//    public void testGetRsa() throws Exception {
//        System.out.println("testGetRsa......................");
//        this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
//        this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
//    }
//
//    @Test
//    public void testGenerateToken() throws Exception {
//        // 生成token
//        String token = JwtUtils.generateToken(new UserInfo(20L, "jack"), privateKey, 5);
//        System.out.println("token = " + token);
//    }
//
//    @Test
//    public void testParseToken() throws Exception {
//        String token = "eyJhbGciOiJSUzI1NiJ9.eyJpZCI6MjAsInVzZXJuYW1lIjoiamFjayIsImV4cCI6MTU1NzcxMTczMH0.ZfM5XFNR1VphY6uCcUcVhaafCDrSp1OCy7d7rAqe-s9Q7VBr3L2WMucPHFNfax3jtfxA-xiD9JedGS2W3mUrs1lJpeMQ48YTbTJZ420n0kzGfPLd01ARwfsP0wruhhXmD9htP5r1ox3NUlreY9obpOkRPIhFa8d8wPlw6fxkifI";
//
//        // 解析token
//        UserInfo user = JwtUtils.getInfoFromToken(token, publicKey);
//        System.out.println("id: " + user.getId());
//        System.out.println("userName: " + user.getUsername());
//    }
//
//    @Test
//    public void date(){
//        System.out.println(new Date());
//    }
//}