from flask import Flask, request
import sys

app = Flask(__name__)

# http POST http://127.0.0.1:5000/classifica text="Eu estou feliz" identificador="xxxx" datetime="0"
@app.route('/classifica', methods=['POST'])
def classifica():
    if request.method == 'POST':
        text = request.args['text']
        identificador = request.args['identificador']
        datetime = request.args['datetime']

        msg = f'{datetime} {identificador} --> {text}'

        print(msg, file=sys.stderr)
    return ''
