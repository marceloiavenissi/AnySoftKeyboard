from flask import request

@app.route('/classifica', methods=['POST'])
def classifica():
    if request.method == 'POST':
        text = request.form['text']
        identificador = request.form['identificador']
        datetime = request.form['datetime']

        print(identificador)
        print(text)
        print(datetime)
