/**
*Объявление пакета, в котором находится класс
*/
package test00.project00;
/**
*Создание класса для проверки пароля
*/
public class PasswordClassic { 
	/**
	*Создание метода проверки пароля
	*/
	public int getP(int pass){ 
		/**
		*Создание вспомогательной переменной для провеки пароля
		*/
		int x = 0;
		/**
		*Задание условия правильности пароля
		*/
		if (pass == 123){
		/**
		*Присваивание переменной значения в случае правильности пароля
		*/
		x = 1;
		/**
		*Окончания задания условия правильности пароля
		*/
		}else
		/**
		*Присваивание переменной значения в случае неправильности пароля
		*/
		x = 0;
		/**
		*Возвращение вспомогательной переменной
		*/
		return x;
		/**
		*Окончание создания метода проверки пароля
		*/
		}
	/**
	*Окончание создания класса для проверки пароля
	*/
}
