Модули верхнего уровня не должны зависеть от модулей нижнего уровня.
И те, и другие должны зависеть от абстракций.
Абстракции не должны зависеть от деталей.
Детали должны зависеть от абстракций.


Dependency Inversion Principle — принцип инверсии зависимости

Модуль Car не зависит от модуля PetrolEngine или DieselPetrol, но зависят  от интерфейса Engine