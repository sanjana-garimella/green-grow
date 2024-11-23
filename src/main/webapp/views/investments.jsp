<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Investments page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <link rel="stylesheet" href="form.css" >
        <script src="form.js"></script>
    </head>
    <body >
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <h2>Investments</h2> Got a Investment ? Green Product Investment? Awesome! 
                    <p> Send your investment in the form below and you can view green products as early as possible. </p>
                    <form role="form" method="post" id="reused_form" action="/investments" >
                        <div class="form-group">
                            <label for="name"> Name:</label>
                            <input name="stk_name" type="text" class="form-control" id="name"  required maxlength="50">
                        </div>
                        <div class="form-group">
                            <label for="email"> Email:</label>
                            <input name="stk_email" type="email" class="form-control" id="email" required maxlength="50">
                        </div>
                        <div class="form-group">
                            <label for="email"> Green Enterpreneur Email:</label>
                            <input name="stk_grn_email" type="email" class="form-control" id="email" required maxlength="50">
                        </div>
                        <div class="form-group">
                            <label for="name"> Investment Amount:</label>
                            <input name="stk_price" type="text" class="form-control" id="price"  required maxlength="50">
                        </div>
                        <div class="form-group">
                            <label for="name"> Investment Description:</label>
                            <textarea name="stk_investment" class="form-control" type="textarea" id="message" placeholder="Your Message Here" maxlength="6000" rows="7"></textarea>
                        </div>
                        <button type="submit" class="btn btn-lg btn-success pull-right" id="btnContactUs">Post It! &rarr;</button>
                    </form>
                    <div id="success_message" style="width:100%; height:100%; display:none; "> <h3>Sent your message successfully!</h3> </div>
                    <div id="error_message" style="width:100%; height:100%; display:none; "> <h3>Error</h3> Sorry there was an error sending your form. </div>
                </div>
            </div>
        </div>
    </body>
</html>