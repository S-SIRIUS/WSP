from flask import request, render_template, flash, redirect, url_for
from flask import Flask
from module import dbModule
app = Flask(__name__)

@app.route('/', methods=["GET"])
def index():
    return render_template('test.html',
                           result=None,resultData=None,
                           resultUPDATE=None)

@app.route('/select', methods=['GET'])
def select():
    db_class = dbModule.Database()
    sql = "SELECT * FROM madang.book"
    row = db_class.executeAll(sql)
    print(row)
    return render_template('test.html',result=None,resultData=row[0],resultUPDATE=None)

app.run(host="localhost",port=5001)