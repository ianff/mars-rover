Mars Rover
===========
假想你在火星探索团队中负责软件开发。现在你要给登陆火星的探索小车编写控制程序，根据地球发送的控制指令来控制火星车的行动。
火星车收到的指令分为：
+ 初始化信息：火星车的降落地点（x, y）和朝向（N, S, E, W）信息；

+ 移动指令：火星车可以前进（M）,一次移动一格；

+ 转向指令：火星车可以左转90度（L）或右转90度（R）。

由于地球和火星之间的距离很远，指令必须批量发送，火星车执行完整批指令之后，再回报自己所在的位置坐标和朝向。

Tasks
-------
given: initial landed information, location(x, y), direction(N, S, E, W)
when: doInstruction
then: return location and direction(x, y) = (10.2, 40.5), direction = N

given: the rover already landed with current location(10.2, 40.5) and direction = N, and given move forward instruction
when: doInstruction
then: return location and direction(x, y) = (10.2, 41.5)(x, y + 1), direction = N

given: the rover already landed with current location(10.2, 40.5) and direction = S, and given move forward instruction
when: doInstruction
then: return location and direction(x, y) = (10.2, 39.5)(x, y - 1), direction = S

given: the rover already landed with current location(10.2, 40.5) and direction = W, and given move forward instruction
when: doInstruction
then: return location and direction(x, y) = (9.2, 40.5)(x - 1, y), direction = W

given: the rover already landed with current location(10.2, 40.5) and direction = E, and given move forward instruction
when: doInstruction
then: return location and direction(x, y) = (11.2, 40.5)(x + 1, y), direction = E

given: the rover already landed with current location(10.2, 40.5) and direction = N, and given left turn instruction
when: doInstruction
then: return location and direction(x, y) = (10.2, 40.5)(x, y), direction = W

given: the rover already landed with current location(10.2, 40.5) and direction = N, and given right turn instruction
when: doInstruction
then: return location and direction(x, y) = (10.2, 40.5)(x, y), direction = E

given: the rover already landed with current location(10.2, 40.5) and direction = S, and given left turn instruction
when: doInstruction
then: return location and direction(x, y) = (10.2, 40.5)(x, y), direction = E

given: the rover already landed with current location(10.2, 40.5) and direction = S, and given right turn instruction
when: doInstruction
then: return location and direction(x, y) = (10.2, 40.5)(x, y), direction = W

given: the rover already landed with current location(10.2, 40.5) and direction = W, and given left turn instruction
when: doInstruction
then: return location and direction(x, y) = (10.2, 40.5)(x, y), direction = S

given: the rover already landed with current location(10.2, 40.5) and direction = W, and given right turn instruction
when: doInstruction
then: return location and direction(x, y) = (10.2, 40.5)(x, y), direction = N

given: the rover already landed with current location(10.2, 40.5) and direction = E, and given left turn instruction
when: doInstruction
then: return location and direction(x, y) = (10.2, 40.5)(x, y), direction = N

given: the rover already landed with current location(10.2, 40.5) and direction = S, and given right turn instruction
when: doInstruction
then: return location and direction(x, y) = (10.2, 40.5)(x, y), direction = S