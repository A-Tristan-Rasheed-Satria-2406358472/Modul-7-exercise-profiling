# Exercise Profiling

## Unoptimized Result

The following results were collected before optimization using 10 samples for each endpoint with 10,000 seeded students.
The raw JMeter logs, screenshots, and summary CSV file are saved under `Jmeter/UNOPTIMIZED`.

| Endpoint            | Samples |  Average |      Min |      Max | Std. Dev. | Error % |   Throughput | Avg. Bytes |
| ------------------- | ------: | -------: | -------: | -------: | --------: | ------: | -----------: | ---------: |
| `/all-student`      |      10 | 78190 ms | 77412 ms | 79414 ms |    539.54 |  0.000% |  0.12538/sec |  1991306.0 |
| `/all-student-name` |      10 |  1995 ms |  1590 ms |  2198 ms |    183.99 |  0.000% |  3.71609/sec |   227133.0 |
| `/highest-gpa`      |      10 |   142 ms |    93 ms |   209 ms |     38.81 |  0.000% | 10.90513/sec |      269.0 |

Summary CSV: [unoptimized-summary.csv](Jmeter/UNOPTIMIZED/unoptimized-summary.csv)

### Screenshots

SUMMARY `/all-student`

![Unoptimized all-student](Jmeter/UNOPTIMIZED/1-all-student-request/student-req-unoptimized.png)

SUMMARY `/all-student-name`

![Unoptimized all-student-name](Jmeter/UNOPTIMIZED/2-all-student-name/student-name-unoptimized.png)

SUMMARY `/highest-gpa`

![Unoptimized highest-gpa](Jmeter/UNOPTIMIZED/3-highest-gpa/highest-gpa-unoptimized.png)

### CLI Results

CLI RESULT `/all-student`

![Unoptimized all-student CLI result](Jmeter/UNOPTIMIZED/1-all-student-request/cli-test-1.png)

CLI RESULT `/all-student-name`

![Unoptimized all-student-name CLI result](Jmeter/UNOPTIMIZED/2-all-student-name/cli-test-2.png)

CLI RESULT `/highest-gpa`

![Unoptimized highest-gpa CLI result](Jmeter/UNOPTIMIZED/3-highest-gpa/cli-test-3.png)

### Raw Result Files

RAW RESULT `/all-student`: [test_result_log1.jtl](Jmeter/UNOPTIMIZED/1-all-student-request/test_result_log1.jtl)

|     timeStamp | elapsed | label               | responseCode | threadName          | success |   bytes | sentBytes | Latency | Connect |
| ------------: | ------: | ------------------- | -----------: | ------------------- | ------- | ------: | --------: | ------: | ------: |
| 1777363231014 |   77704 | all-student-request |          200 | Thread Group 1 1-5  | true    | 1991306 |       128 |   77660 |       1 |
| 1777363230915 |   77803 | all-student-request |          200 | Thread Group 1 1-4  | true    | 1991306 |       128 |   77774 |       1 |
| 1777363230814 |   78033 | all-student-request |          200 | Thread Group 1 1-3  | true    | 1991306 |       128 |   78014 |       1 |
| 1777363231515 |   77412 | all-student-request |          200 | Thread Group 1 1-10 | true    | 1991306 |       128 |   77395 |       2 |
| 1777363230769 |   78391 | all-student-request |          200 | Thread Group 1 1-1  | true    | 1991306 |       128 |   78374 |      28 |
| 1777363231215 |   78150 | all-student-request |          200 | Thread Group 1 1-7  | true    | 1991306 |       128 |   78120 |       1 |
| 1777363231413 |   77960 | all-student-request |          200 | Thread Group 1 1-9  | true    | 1991306 |       128 |   77924 |       2 |
| 1777363230771 |   78727 | all-student-request |          200 | Thread Group 1 1-2  | true    | 1991306 |       128 |   78682 |      32 |
| 1777363231313 |   78307 | all-student-request |          200 | Thread Group 1 1-8  | true    | 1991306 |       128 |   78288 |       2 |
| 1777363231115 |   79414 | all-student-request |          200 | Thread Group 1 1-6  | true    | 1991306 |       128 |   79389 |       2 |

RAW RESULT `/all-student-name`: [test_result_log2.jtl](Jmeter/UNOPTIMIZED/2-all-student-name/test_result_log2.jtl)

|     timeStamp | elapsed | label            | responseCode | threadName          | success |  bytes | sentBytes | Latency | Connect |
| ------------: | ------: | ---------------- | -----------: | ------------------- | ------- | -----: | --------: | ------: | ------: |
| 1777363440218 |    1590 | all-student-name |          200 | Thread Group 1 1-4  | true    | 227133 |       133 |    1574 |       1 |
| 1777363440082 |    1853 | all-student-name |          200 | Thread Group 1 1-1  | true    | 227133 |       133 |    1851 |      32 |
| 1777363440081 |    2064 | all-student-name |          200 | Thread Group 1 1-2  | true    | 227133 |       133 |    2062 |      33 |
| 1777363440125 |    2138 | all-student-name |          200 | Thread Group 1 1-3  | true    | 227133 |       133 |    2136 |       1 |
| 1777363440316 |    2097 | all-student-name |          200 | Thread Group 1 1-5  | true    | 227133 |       133 |    2096 |       2 |
| 1777363440416 |    2115 | all-student-name |          200 | Thread Group 1 1-6  | true    | 227133 |       133 |    2113 |      26 |
| 1777363440847 |    1769 | all-student-name |          200 | Thread Group 1 1-10 | true    | 227133 |       133 |    1767 |      20 |
| 1777363440515 |    2198 | all-student-name |          200 | Thread Group 1 1-7  | true    | 227133 |       133 |    2196 |       2 |
| 1777363440747 |    2023 | all-student-name |          200 | Thread Group 1 1-9  | true    | 227133 |       133 |    2021 |      10 |
| 1777363440671 |    2101 | all-student-name |          200 | Thread Group 1 1-8  | true    | 227133 |       133 |    2099 |      19 |

RAW RESULT `/highest-gpa`: [test_result_log3.jtl](Jmeter/UNOPTIMIZED/3-highest-gpa/test_result_log3.jtl)

|     timeStamp | elapsed | label       | responseCode | threadName        | success | bytes | sentBytes | Latency | Connect |
| ------------: | ------: | ----------- | -----------: | ----------------- | ------- | ----: | --------: | ------: | ------: |
| 1777363502913 |     209 | highest-gpa |          200 | Thread Group 1-2  | true    |   269 |       128 |     205 |      26 |
| 1777363502913 |     209 | highest-gpa |          200 | Thread Group 1-1  | true    |   269 |       128 |     205 |      26 |
| 1777363502991 |     153 | highest-gpa |          200 | Thread Group 1-3  | true    |   269 |       128 |     153 |       2 |
| 1777363503092 |     109 | highest-gpa |          200 | Thread Group 1-4  | true    |   269 |       128 |     108 |       1 |
| 1777363503190 |      93 | highest-gpa |          200 | Thread Group 1-5  | true    |   269 |       128 |      93 |       1 |
| 1777363503289 |     132 | highest-gpa |          200 | Thread Group 1-6  | true    |   269 |       128 |     131 |       1 |
| 1777363503389 |     113 | highest-gpa |          200 | Thread Group 1-7  | true    |   269 |       128 |     113 |       1 |
| 1777363503488 |     115 | highest-gpa |          200 | Thread Group 1-8  | true    |   269 |       128 |     115 |       1 |
| 1777363503594 |     161 | highest-gpa |          200 | Thread Group 1-9  | true    |   269 |       128 |     161 |       1 |
| 1777363503709 |     121 | highest-gpa |          200 | Thread Group 1-10 | true    |   269 |       128 |     121 |       1 |

## Project Run

### Run Project

Run project with Docker Compose:

```bash
docker compose up --build
```

Run in background:

```bash
docker compose up --build -d
```

Stop project:

```bash
docker compose down
```

Alternative run with Maven, if PostgreSQL is already running on `localhost:5433`:

On Windows Command Prompt or PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

On Git Bash, Linux, or macOS:

```bash
./mvnw spring-boot:run
```

Application URL:

```text
http://localhost:8080
```

### Seed Data

Seed students and courses:

```powershell
Invoke-WebRequest http://localhost:8080/seed-data-master
```

Seed student-course relations:

```powershell
Invoke-WebRequest http://localhost:8080/seed-student-course
```

Alternative with curl:

```bash
curl http://localhost:8080/seed-data-master
curl http://localhost:8080/seed-student-course
```

### Troubleshooting

If Spring Boot fails with `Port 8080 was already in use`, another app is already running on port `8080`.

Check which process uses port `8080` on Windows PowerShell:

```powershell
Get-NetTCPConnection -LocalPort 8080 -State Listen | Select-Object LocalAddress,LocalPort,OwningProcess
```

Stop the process by replacing `<PID>` with the `OwningProcess` value:

```powershell
Stop-Process -Id <PID>
```

If the port is used by the Docker app container, stop only the app container and keep PostgreSQL running:

```bash
docker compose stop app
```

If you want to stop all containers:

```bash
docker compose down
```

Note: PostgreSQL uses port `5433` in this project, so `Port 8080 was already in use` is usually caused by the Spring Boot app, not PostgreSQL.
