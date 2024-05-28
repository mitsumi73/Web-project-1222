<h1 align="center">ProcessLogEvent</h1>

<h2 align="center">웹프로그래밍 (DD725_1222) 정경용 교수님</h2>

<h2 align="center">보꾸옥안 - 준문서 - 박진성</h2>

<div align=center>
  <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white">
  <img src="https://img.shields.io/badge/CSS-1572B6?style=for-the-badge&logo=css3&logoColor=white">
  <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&lgoColor=white">
  <img src="https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white">
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
</div>

# 프로젝트 목표

- 배운 내용을 바탕으로 나만의 웹페이지 레이아웃을 설계하고 구현합니다.
- HTML, CSS, 자바스크립트를 활용하여 웹페이지를 만듭니다.
- 사용자 경험을 고려한 효과적인 디자인을 적용합니다.

> 이 프로젝트는 웹 개발 기술을 실제로 적용해보고, 창의적인 웹페이지를 완성함으로써 학습한 내용을 실전에서 활용할 수 있는 능력을 키우는 것을 목표로 합니다.


# 개발 환경
<p align="center"> 
<img src="webprograming.svg" alt="개발 환경">
</p>

# 프로젝트에 대한 간단히 설명
이 프로젝트는 "ProcessLogEvent"라는 이름의 웹 애플리케이션입니다. 이 애플리케이션은 이벤트 로깅 및 데이터 시각화 기능을 제공합니다. 주요 기능은 다음과 같습니다:

+ 홈페이지 (home.html):
  - 프로젝트의 기본적인 소개와 환영 메시지.
  - 주요 이벤트와 동영상 이벤트를 소개.
  - FAQ 섹션을 통해 자주 묻는 질문에 대한 답변 제공.
  - 이미지 캐러셀을 통해 여러 이미지를 슬라이드쇼 형태로 보여줌.

+ 파일 업로드 (upload.html):
  - 사용자가 XES 파일을 업로드할 수 있는 인터페이스 제공.
  - 드래그 앤 드롭 방식으로 파일 업로드를 지원.
  - 업로드된 파일은 이벤트 로깅에 사용됨.

+ 데이터 뷰 (data-view.html):
  - 글로벌 트레이스 속성, 글로벌 이벤트 속성, 분류자, 이벤트 속성 등을 테이블 형태로 시각화.
  - 각 테이블에 대한 검색 기능 제공.
  - 테이블 행에 마우스를 올리면 강조 표시.

+ 운영 선택 (select-operation.html):
  - 사용자에게 선택 가능한 이벤트 목록을 제공.
  - 이벤트 목록을 검색하거나 정렬할 수 있는 기능 제공.
  - 검색 입력란과 정렬 버튼을 통해 목록을 필터링하고 정렬 가능.

+ 팀 멤버 소개 (about.html):
  - 팀 멤버들의 프로필을 카드 형태로 소개.
  - 각 팀 멤버의 이름, 사진, 직책, 관심 분야 등을 표시.

# 프로젝트의 성공적인 수행을 위해 필요한 구성 요소

## 1. CSS3를 사용해 수평 정렬하는 방법
```css
/* ===== from select-operation.html ===== */
.wrapper {
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    align-items: center;
    flex: 1;
    width: 100%;
}
```

## 2. CSS3를 사용해 중앙 정렬하는 방법:
```css
/* ===== from upload.html ===== */
body, html {
    height: 100%;
    margin: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    background-color: #e4e9f7;
}
```

## 3. CSS3를 사용해 One True 레이아웃을 구성:
```css
/* ===== from data-view.html ===== */
body {
    display: flex;
    flex-direction: column;
    min-height: 100vh;
}
.wrapper {
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    align-items: center;
    flex: 1;
    width: 100%;
}
```

## 4. CSS3의 절대 좌표를 활용:
```css
/* ===== from select-operation.html ===== */
header, footer {
    width: 100%;
    background: #e1e1e1;
    padding: 10px;
    text-align: center;
    flex-shrink: 0;
}
```

## 5. 반응형 웹을 구현하는 방법:
```css
/* ===== from data-view.html ===== */
@media screen and (max-width: 600px) {
    table {
        width: 100%;
    }
    th, td {
        font-size: 14px;
        padding: 8px;
    }
}

```

## 6. 자바스크립트, 객체, 문서객체모델(DOM), jQuery 라이브러리, jQuery 플러그인 사용:

```javascript
/* ===== from select-operation.html ===== */
<script>
    $(document).ready(function(){
        // Filter events based on search input
        $("#eventSearch").on("keyup", function() {
            var value = $(this).val().toLowerCase();
            $("#eventList li").filter(function() {
                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
            });
        });

        // Sort functions
        function sortListAsc() {
            var list = $("#eventList");
            var items = list.children("li").get();
            items.sort(function(a, b) {
                var keyA = $(a).find("a").text().toLowerCase();
                var keyB = $(b).find("a").text().toLowerCase();
                return (keyA < keyB) ? -1 : (keyA > keyB) ? 1 : 0;
            });
            $.each(items, function(i, li) {
                list.append(li);
            });
        }

        function sortListDesc() {
            var list = $("#eventList");
            var items = list.children("li").get();
            items.sort(function(a, b) {
                var keyA = $(a).find("a").text().toLowerCase();
                var keyB = $(b).find("a").text().toLowerCase();
                return (keyA > keyB) ? -1 : (keyA < keyB) ? 1 : 0;
            });
            $.each(items, function(i, li) {
                list.append(li);
            });
        }

        // Attach sort functions to buttons
        $("#sortAsc").on("click", sortListAsc);
        $("#sortDesc").on("click", sortListDesc);
    });
</script>
```
```javascript
/* ===== from home.html ===== */
<script>
    $(document).ready(function(){
        // Handle navigation and content loading
        document.querySelectorAll('.nav-link a').forEach(link => {
            link.addEventListener('click', function (event) {
                event.preventDefault();
                const url = this.getAttribute('data-url');
                fetchContent(url);
            });
        });

        function fetchContent(url) {
            fetch(url)
                .then(response => response.text())
                .then(data => {
                    document.getElementById('content-section').innerHTML = data;
                })
                .catch(error => {
                    console.error('Error fetching content:', error);
                    document.getElementById('content-section').innerHTML = '<p>Error loading content. Please try again later.</p>';
                });
        }

        // Toggle sidebar
        const toggle = document.querySelector(".toggle");
        if (toggle) {
            toggle.addEventListener("click", () => {
                document.querySelector('nav').classList.toggle("close");
            });
        }
    });
</script>
```

## 7. 효과적인 디자인 구성 적용:
```css
/* ===== from about.html ===== */
.member-card {
    display: flex;
    flex-direction: column;
    background-color: #fff;
    border-radius: 20px;
    padding: 16px 0 16px 16px;
    width: 60%;
}

```

## 8. 오디오 및 동영상 활용 가능(option):
```css
<!-- ===== from home.html ===== -->
<iframe
    src="https://www.youtube-nocookie.com/embed/znzPX8EypHk?enablejsapi=1&amp;rel=0"
    title="YouTube video player"
    frameborder="0"
    allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
    allowfullscreen
    class="responsive-video">
</iframe>
```

# 개발 결과

### 총 6페이지 있습니다

<p align="center"> Main Page(home.html) & Home Page(index.html)</p>

![Main&Home-1](https://github.com/mitsumi73/Web-project-1222/raw/main/src/main/resources/static/images/Home-1.png)
![DarkHome](https://github.com/mitsumi73/Web-project-1222/blob/main/src/main/resources/static/images/Screenshot%202024-05-29%20055748.png)
![Main&Home-2](https://github.com/mitsumi73/Web-project-1222/blob/main/src/main/resources/static/images/Home-2.png)

<p align="center">Upload File Page(upload.html)</p>

![upload](https://github.com/mitsumi73/Web-project-1222/blob/main/src/main/resources/static/images/upload.png)

<p align="center">Team Member Page(about.html)</p>

![Team](https://github.com/mitsumi73/Web-project-1222/blob/main/src/main/resources/static/images/Team.png)

<p align="center">EventLog Page(select-operation.html) & Data View Page (data-view.html)</p>

![Event](https://github.com/mitsumi73/Web-project-1222/raw/main/src/main/resources/static/images/EventLog.png)
![Select](https://github.com/mitsumi73/Web-project-1222/raw/main/src/main/resources/static/images/Select.png)


# 프로잭트 실행 안내

### Build the project
```sell
./gradlew build
```
### Run the application
```sell
./gradlew bootRun
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.5/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.5/gradle-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#using.devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#web)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

