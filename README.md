# MVC 모델을 기반으로 Spring Framewok을 활용한 ERP 웹 사이트 제작

<img width="1393" alt="스크린샷 2024-03-12 오후 12 19 57" src="https://github.com/bbak0105/Final_Study_Project/assets/66405572/0587d837-217f-495c-9c93-d3e9830ea704">

<br/>

## 📌 Backend Skills
### Language
<a><img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/></a>
<a><img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white"/></a>

### Framework
<a><img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/></a>

### IDE
<a><img src="https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white"/></a>

### Skills
<a><img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white"/></a>
<a><img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white"/></a>

<br/>

## 📌 Backend Descriptions
### `Route`
> ✏️ 플라스크에서 라우트를 설정하는 부분입니다.
> 1. get_uploaded_data : 프론트에서 엑셀을 업로드하면 해당 라우터로 보내집니다. 받은 데이터를 토대로 전역변수에 담아 저장합니다.
> 2. get_analysis_list : 업로드 된 파일을 토대로 데이터 분석을 진행한 후, 분석 데이터를 리턴합니다.
> 3. get_lstm_dat : 프론트에서 예상 재고 수량을 입력하여 받아온 데이터를 토대로 LSTM을 진행하여 최적의 재고를 예측합니다. 예측한 데이터를 리턴합니다.

```python

```

---

### `Data Analysis`
> ✏️ groupby, 빈도분석 등 기초적인 데이터를 분석하는 곳입니다. <br/>
> 기본적인 전처리 작업 이후에 데이터를 분석하여 분석된 데이터를 리턴합니다.

```python

```
[↑ 전체코드보기](https://github.com/bbak0105/AI_Project_Back/blob/main/TotalAnalyize.py)

<br/>

> 캡쳐본
<img width="953" alt="스크린샷 2024-03-10 오후 11 25 24" src="https://github.com/bbak0105/AI_Project_Front/assets/66405572/717b8bfc-8a0c-48a5-88ab-f46c6f0254f6">

---

### `Stock Prediction`
> ✏️ 프론트에서 사용자가 보내준 데이터를 바탕으로 LSTM으로 적정 재고량을 예측합니다. <br/>
> 테스트 데이터는 과거 6개월의 데이터로, 학습 데이터는 과거 6~18개월 전 12개월의 데이터로 진행합니다. <br/>
> 데이터전처리, MinMaxScaler 정규화, LSTM 모델, Adam 옵티마이저 및 mean_squared_error 손실함수를 사용하여 모델 컴파일을 진행하였습니다.

```python

```

[↑ 전체코드보기](https://github.com/bbak0105/AI_Project_Back/blob/main/PredictInventory.py)
