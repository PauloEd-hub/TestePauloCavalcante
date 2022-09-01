select * from Pessoa p
Left Join Fisica f  ON p.pess_id =  f.fisc_pessoa
where  f.fisc_pessoa = null