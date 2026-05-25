# Beautiful Text

[English](#english) | [Русский](#русский)

---

## English

A Minecraft Fabric mod that automatically formats your chat messages with Minecraft color and formatting codes.

### Overview

Beautiful Text automatically prepends a configurable formatting prefix to every chat message you send. Set the prefix once in Mod Menu — every message you type will appear with that style, without having to retype color codes by hand.

### Features

- **Automatic formatting** — every chat message you send is wrapped with your configured prefix (default: `&6&l`, gold + bold).
- **Bang-prefix passthrough** — messages starting with `!` keep the bang and apply the prefix to the rest, so you can call out lines.
- **Command-safe** — anything starting with `/` is not touched.
- **GUI configuration** — toggle the mod on/off and edit the prefix from Mod Menu.

### Examples

| Input | Result |
| --- | --- |
| `hello` | `&6&lhello` (gold bold) |
| `!hello` | `!&6&lhello` (literal `!`, then gold bold) |
| `/help` | `/help` (unchanged — it's a command) |

### Requirements

| | |
| --- | --- |
| Minecraft | **1.21.4** |
| Fabric Loader | `>= 0.17.2` |
| Fabric API | any build for 1.21.4 |
| Java | `>= 21` |
| Mod Menu | recommended (for in-game settings UI) |

### Installation

1. Install Fabric Loader `0.17.2+` and Fabric API for Minecraft `1.21.4`.
2. Download the latest `beautiful-text-*.jar` from the [Releases](https://github.com/Fix85/beautiful-text/releases) page.
3. Drop the jar into your Minecraft `mods/` folder.
4. Launch the game.

### Configuration

1. Open the Minecraft main menu, click **Mods**.
2. Find **Beautiful Text**, click the gear icon.
3. Set your prefix (any Minecraft color/format code, e.g. `&c&l` for red + bold).

### Minecraft color codes

`&0` black · `&1` dark blue · `&2` dark green · `&3` dark aqua · `&4` dark red · `&5` dark purple · `&6` gold · `&7` gray · `&8` dark gray · `&9` blue · `&a` green · `&b` aqua · `&c` red · `&d` light purple · `&e` yellow · `&f` white

### Format codes

`&l` bold · `&o` italic · `&n` underline · `&m` strikethrough · `&k` obfuscated · `&r` reset

### Other Minecraft versions

| Branch | Minecraft |
| --- | --- |
| [`mc-1.21.4`](https://github.com/Fix85/beautiful-text/tree/mc-1.21.4) | 1.21.4 |
| [`mc-1.17.1`](https://github.com/Fix85/beautiful-text/tree/mc-1.17.1) | 1.17.1 |

### Build from source

```bash
git clone https://github.com/Fix85/beautiful-text.git
cd beautiful-text
git checkout mc-1.21.4
./gradlew build
```

The jar lands in `build/libs/`.

### License

Released under CC0-1.0 — do whatever you want with it.

### Author

**Fix85** — [github.com/Fix85](https://github.com/Fix85)

---

## Русский

Мод для Minecraft Fabric, который автоматически форматирует ваши сообщения в чате цветовыми кодами Minecraft.

### Описание

Beautiful Text автоматически добавляет настроенный префикс форматирования к каждому отправленному сообщению. Настроил префикс один раз в Mod Menu — и больше не нужно каждый раз вручную набирать цветовые коды.

### Возможности

- **Автоматическое форматирование** — все отправленные сообщения получают настроенный префикс (по умолчанию `&6&l` — жёлтый жирный).
- **Сообщения с `!`** — если сообщение начинается с `!`, восклицательный знак остаётся, а префикс применяется к остатку.
- **Команды не трогаются** — всё, что начинается с `/`, проходит без изменений.
- **GUI настройка** — включение/выключение и редактирование префикса прямо в Mod Menu.

### Примеры

| Ввод | Результат |
| --- | --- |
| `hello` | `&6&lhello` (жёлтый жирный) |
| `!hello` | `!&6&lhello` (`!` + жёлтый жирный) |
| `/help` | `/help` (команда — не обрабатывается) |

### Требования

| | |
| --- | --- |
| Minecraft | **1.21.4** |
| Fabric Loader | `>= 0.17.2` |
| Fabric API | любая сборка для 1.21.4 |
| Java | `>= 21` |
| Mod Menu | рекомендуется (для GUI настроек) |

### Установка

1. Установи Fabric Loader `0.17.2+` и Fabric API для Minecraft `1.21.4`.
2. Скачай последний `beautiful-text-*.jar` со страницы [Releases](https://github.com/Fix85/beautiful-text/releases).
3. Закинь jar в папку `mods/` твоего клиента Minecraft.
4. Запусти игру.

### Настройка

1. Открой главное меню Minecraft, нажми **Mods**.
2. Найди **Beautiful Text**, нажми на шестерёнку.
3. Поставь нужный префикс (любой Minecraft код цвета/форматирования, например `&c&l` — красный жирный).

### Цветовые коды Minecraft

`&0` чёрный · `&1` тёмно-синий · `&2` тёмно-зелёный · `&3` тёмно-бирюзовый · `&4` тёмно-красный · `&5` пурпурный · `&6` золотой · `&7` серый · `&8` тёмно-серый · `&9` синий · `&a` зелёный · `&b` бирюзовый · `&c` красный · `&d` розовый · `&e` жёлтый · `&f` белый

### Коды форматирования

`&l` жирный · `&o` курсив · `&n` подчёркнутый · `&m` зачёркнутый · `&k` случайные символы · `&r` сброс

### Другие версии Minecraft

| Ветка | Minecraft |
| --- | --- |
| [`mc-1.21.4`](https://github.com/Fix85/beautiful-text/tree/mc-1.21.4) | 1.21.4 |
| [`mc-1.17.1`](https://github.com/Fix85/beautiful-text/tree/mc-1.17.1) | 1.17.1 |

### Сборка из исходников

```bash
git clone https://github.com/Fix85/beautiful-text.git
cd beautiful-text
git checkout mc-1.21.4
./gradlew build
```

Готовый jar — в `build/libs/`.

### Лицензия

CC0-1.0 — делай с этим что хочешь.

### Автор

**Fix85** — [github.com/Fix85](https://github.com/Fix85)
