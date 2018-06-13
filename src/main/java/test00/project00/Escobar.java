/**
*Объявление пакета, в котором находится класс
*/
package test00.project00; 
/**
*Добавление библеотек для создания графического интерфейса
*/
import javax.swing.*;
/**
*Добавление библеотек графического интерфейса
*/
import java.awt.*;
/**
*Добавление библеотек графического интерфеса событий
*/
import java.awt.event.*;
/**
*Добавление класса ФормМенеджер
*/
import test00.project00.FormManager;
/**
*Создание класса Эксобар для выбора пользователя 
*/
public class Escobar extends JFrame {
	/**
	*Создание конструктора формы Эскобар
	*/
public Escobar(FormManager manager) {
	/**
	*Задание размеров формы
	*/
setPreferredSize(new Dimension(410, 370));
/**
*Установка оптимального размера для формы
*/
pack();
  /**  this.getContentPane().setBackground(Color.blue);
/**
* Задание параметров установки панели
*/
getContentPane().setLayout(null);
/**
*Объявление кнопки Клиент
*/
JButton Client = new JButton("Клиент");
/**
*Вызов метода для задания координат и размера кнопки
*/
test00.project00.Method.Button(Client,21, 168, 89, 36, 12);
/**
*Добавление кнопки на форму Эскобар
*/
getContentPane().add(Client);
/**
*Обработка событий для кнопки Клиент
*/
Client.addActionListener(new ActionListener() {
	/**
	*Создание события для кнопки Клиент
	*/
public void actionPerformed(ActionEvent e) {
	/**
	* Вызов метода управление формами Эскобар и Клиент
	*/
manager.toggleForms();
/**
* Звершение метода для управления формами
*/
}
/**
* Завершение работы события для кнопки Клиент
*/
});
/**
* Объявление кнопки Кредитор
*/
JButton Creditor = new JButton("Кредитор");
/**
* Установка местоположения кнопки Кредитор
*/
test00.project00.Method.Button(Creditor,283, 168, 94, 36, 12);
/**
* Добавление на панель кнопку Кредитор
*/
getContentPane().add(Creditor);
/**
* Обработка событий для кнопки Кредитор
*/
Creditor.addActionListener(new ActionListener() {
	/**
	* Создание события для кнопки Кредитор
	*/
public void actionPerformed(ActionEvent arg0) {
	/**
	* Вызов методов управления Пароль для откытия формы Пароль
	*/
manager.toggleForms2();
/**
* Завершение работы методов управления
*/
}
/**
* Завершение работы события для кнопки Кредитор
*/
});
/**
* Объвление кнопки Выход
*/
JButton Close = new JButton("Выход");
/**
*Вызов метода для задания координат и размера кнопки
*/
test00.project00.Method.Button(Close,304, 297, 80, 23, 12);
/**
*Добавление кнопки на форму Эскобар
*/
getContentPane().add(Close);
/**
*Обработка событий для кнопки Выход
*/
Close.addActionListener(new ActionListener() {
	/**
	*Создание события для кнопки Выход
	*/
public void actionPerformed(ActionEvent arg0) {
	/**
	* Закрытие программы
	*/
System.exit(0);
/**
* Завершение описания закрытия из программы
*/
}
/**
* завершение обработки событий для кнопки Выход
*/
});
/**
* Создание надписи "Выберите пользователя"
*/
JLabel user = new JLabel("Выберите пользователя ");
/**
* Установка фона, шрифта и размера надписи
*/
user.setFont(new Font("Tahoma", Font.PLAIN, 18));
/**
* Задание координат кнопки
*/
user.setBounds(95, 74, 234, 44);
/**
* Добавление кнопки на форму Эскобар
*/
getContentPane().add(user);
/**
*Завершение работы конструктора Эскобар
*/
}
/**
*Завершение создания класса Эскобар
*/
}

