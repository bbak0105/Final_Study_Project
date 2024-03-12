# LSTM을 활용한 재고 관리 웹 사이트 제작 (백엔드)
![DataNomads](https://github.com/bbak0105/AI_Project_Front/assets/66405572/1d1423ee-e0a9-4a93-8072-aee69b1b261b)

<br/>

## 📌 Backend Skills
### Language
<a><img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white"/></a>

### IDE
<a><img src="https://img.shields.io/badge/PyCharm-000000.svg?&style=for-the-badge&logo=PyCharm&logoColor=white"/></a>

### Skills
<a><img src="https://img.shields.io/badge/TensorFlow-FF6F00?style=for-the-badge&logo=tensorflow&logoColor=white"/></a>
<a><img src="https://img.shields.io/badge/ScikitLearn-FF9900?style=for-the-badge"/></a>

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

---

### `Stock Prediction`
> ✏️ 프론트에서 사용자가 보내준 데이터를 바탕으로 LSTM으로 적정 재고량을 예측합니다. <br/>
> 테스트 데이터는 과거 6개월의 데이터로, 학습 데이터는 과거 6~18개월 전 12개월의 데이터로 진행합니다. <br/>
> 데이터전처리, MinMaxScaler 정규화, LSTM 모델, Adam 옵티마이저 및 mean_squared_error 손실함수를 사용하여 모델 컴파일을 진행하였습니다.

```python

```

[↑ 전체코드보기](https://github.com/bbak0105/AI_Project_Back/blob/main/PredictInventory.py)
