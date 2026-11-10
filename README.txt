Кинофестиваль, практическая 06. Java 21.
  IntelliJ IDEA: File > Open, выберите эту папку. File > Project Structure:
  Project SDK = установленный JDK 21, language level = 21. src = Sources Root.
  Откройте src/festival/Main.java и запустите Main.main.
  В меню 1 показывается готовый каталог. 0 завершает программу.
  Сообщение TODO обозначает незавершённый учебный метод.
  Компиляция в терминале из этой папки:
  javac -encoding UTF-8 --release 21 -d out src/festival/*.java
  java -cp out festival.Main
  PowerShell поддерживает эти команды; запускайте их двумя отдельными строками.
  Все изменения хранятся в памяти до завершения программы.
  Пошаговое задание выдаётся отдельным PDF.
