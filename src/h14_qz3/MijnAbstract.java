package h14_qz3;

abstract class MijnAbstract
{
  String str = "N";
  MijnAbstract()
  {
    this("O");
    str += "L";
  }
  MijnAbstract(String str)
  {
    str += str;
  }
}
