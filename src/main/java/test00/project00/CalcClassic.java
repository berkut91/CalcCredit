/**
*Объявление пакета, в котором находится класс
*/
package test00.project00;
/**
*Создание класса для рассчета кредита
*/
public class CalcClassic {
	/**
	*Создание метода рассчета кредита
	*/
	public String getP(int Sum, double bet, int time){ 
		/**
		*Создание переменной Ежемесячный платёж
		*/
		double fPay = 0;
		/**
		*Создание константы для вычисления процентнов для кретита
		*/
		double con = 1;
		/**
		*Создание константы Месяцы для вычисления процентнов для кретита
		*/
		double months = 12;
		/**
		*Вычисление процентов для кредита 
		*/
		bet = con + bet*(time/months);
		/**
		*Создание вспомогательной переменной для вывода Ежемесячного платёжа
		*/
		String str;
		/**
		*Задание формулы для нахождения Ежемесячного платёжа
		*/
		fPay = (Sum*bet)/time; 
		/**
		*Перевод значения переменной Ежемесячный платёж в значение вспомогательной переменной 
		*Умножение значения переменной 
		*/
		fPay = fPay * 100; 
		/**
		*Перевод значения переменной Ежемесячный платёж в значение вспомогательной переменной 
		*Округление значения с дробных до целых чисел
		*/
		int i = (int) Math.round(fPay);
		/**
		*Перевод значения переменной Ежемесячный платёж в значение вспомогательной переменной 
		*Деление значение переменной на 100
		*/
		fPay = (double)i / 100;
		/**
		*Перевод значения переменной Ежемесячный платёж в значение вспомогательной переменной 
		*/
		str = Double.toString(fPay);
		/**
		*Возвращение вспомогательной переменной
		*/
		return str;
		/**
		*Окончание создания метода рассчета кредита
		*/
		} 
	/**
	*Окончание создания класса для рассчета кредита
	*/
} 
