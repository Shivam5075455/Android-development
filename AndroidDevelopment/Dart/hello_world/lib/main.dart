import 'package:flutter/material.dart';
void main(){
  runApp(new MyApp());
}
class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return new MaterialApp(
      title: "My App",
      home: new Scaffold(
        appBar: new AppBar(
          title: new Text("Welcome Page"),
        ),
        body: new Center(child: new Text("Welcome to Flutter"))
      ),
    );
  }
}
