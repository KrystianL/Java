package Dec;

interface Person{
	public String GetData(); // zwraca opis
}
//implementacja normal person bez dekorator�w
class NormalPerson implements Person {
	public String GetData(){
	return "Normal Person";
}

	

}

