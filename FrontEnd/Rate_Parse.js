$(document).ready(function ()
{
  $.getJSON
  ('http://data.fixer.io/api/latest?access_key=0c43401cbf3b9776afa2bd9d30f18934',
  function(data){$('#rate_UAH').text(data.rates.UAH);});
  $.getJSON
  ('http://data.fixer.io/api/latest?access_key=0c43401cbf3b9776afa2bd9d30f18934',
  function(data){$('#rate_USD').text(data.rates.USD);});
  $.getJSON
  ('http://data.fixer.io/api/latest?access_key=0c43401cbf3b9776afa2bd9d30f18934',
  function(data){$('#date').text(data.date);},);
});
