# StatsService

# Домашнее задание к занятию «Циклы и пакеты»

Не забывайте заводить по найденным багам баг-репорты в Github Issue.

В качестве результата пришлите ссылки на ваши GitHub-проекты в личном кабинете студента на сайте [netology.ru](https://netology.ru).

Все задачи этого занятия нужно делать в разных репозиториях.

**Важно**: если у вас что-то не получилось, то оформляйте Issue [по установленным правилам](../report-requirements.md).

**Важно**: не делайте ДЗ всех занятий в одном репозитории! Иначе вам потом придётся достаточно сложно подключать системы Continuous Integration.

Напоминалку по некоторым теоретическим моментам в джаве вы можете найти [здесь](../tips/tips.md).

## Как сдавать задачи

1. Инициализируйте на своём компьютере пустой Git-репозиторий
1. Добавьте в него готовый файл [.gitignore](../.gitignore)
1. Добавьте в этот же каталог необходимые файлы
1. Сделайте необходимые коммиты
1. Создайте публичный репозиторий на GitHub и свяжите свой локальный репозиторий с удалённым
1. Сделайте пуш (удостоверьтесь, что ваш код появился на GitHub)
1. Ссылку на ваш проект отправьте в личном кабинете на сайте [netology.ru](https://netology.ru)
1. Задачи, отмеченные, как необязательные, можно не сдавать, это не повлияет на получение зачета (в этом ДЗ все задачи являются обязательными)

## Задача №1 - Количество квадратов

### Легенда

Вам предстоит разработать сервисный класс, метод которого перебирает числа от 10 до 99 и считает сколько из их квадратов попали в определённый диапазон чисел, границы которого заданы параметрами этого метода (границы считать входящими в диапазон).

Например, если границы заданы диапазоном от 200 до 300, то квадраты лишь трёх чисел 15, 16 и 17 попадают в диапазон от 200 до 300 и на таких данных метод должен вернуть число 3.

Вам необходимо:
1. Создать Maven проект, в котором в package `ru.netology.sqr` будет класс `SQRService` с необходимым методом (сами придумайте ему говорящее название*).
2. Метод должен принимать два целых числа в параметрах - границы диапазона.
3. Написать на метод автотесты, который проверяет правильность работы на тестовых данных (подберите сами)
4. Убедитесь, что ваши автотесты работают и проходят (для этого пробуйте "ронять" каждый свой тест и удостоверяйтесь, что он действительно падает).

Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код и автотесты к нему.
    
Примечание:* имена методов с маленькой буквы, на правильном английском без транслитерации и сокращений. Не должно быть никаких `f`, `calc1`, `cMin` и т.д. В то же время перебарщивать тоже не надо. 

**Важно**: старайтесь отвыкать от создания класса `Main` и проверки работы приложения через него. Помните, что для проверки у вас есть Maven и автотесты.
