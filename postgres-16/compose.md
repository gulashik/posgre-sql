Что запущено?
```shell
podman ps -a
```

Запускаем контейнер
```shell
clear
podman compose down && \
podman compose up -d
podman ps -a
```

Останавливаем контейнер
```shell
podman compose down
podman ps -a
```

**Доступ к pgAdmin** </br>
Панель управления доступна по адресу: http://localhost:5050

**Master password**: postgres
**User DB password**: postgres

**Данные для входа:**
- **Email:** `admin@local.dev`
- **Password:** `postgres`

Внутри pgAdmin уже настроено автоматическое подключение к PostgreSQL (сервер `Local Postgres`).